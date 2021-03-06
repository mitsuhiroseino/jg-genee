package com.purejadeite.genee.option.cell;

import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.util.CaseFormat;

/**
*
* <pre>
* ロウアーハイフン形式の文字列へ変換を行うクラス
* 例: "abcDef" -> "abc-def"
* </pre>
* @author mitsuhiroseino
*
*/
public class LowerHyphen extends AbstractCaseFormatCellOption {

	private static final long serialVersionUID = 1942276560388833496L;

	/**
	 * コンストラクタ
	 * @param cell 値の取得元Cell読み込み定義
	 * @param config コンバーターのコンフィグ
	 */
	public LowerHyphen(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object applyToString(String value, ContentInterface<?, ?> content) {
		return format(value, CaseFormat.LOWER_HYPHEN);
	}

}
