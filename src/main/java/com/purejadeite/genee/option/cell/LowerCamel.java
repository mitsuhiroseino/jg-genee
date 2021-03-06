package com.purejadeite.genee.option.cell;

import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.util.CaseFormat;

/**
*
* <pre>
* ロウアーキャメル形式の文字列へ変換を行うクラス
* 例: "ABC_DEF" -> "abcDef"
* </pre>
* @author mitsuhiroseino
*
*/
public class LowerCamel extends AbstractCaseFormatCellOption {

	private static final long serialVersionUID = -1001501612819077056L;

	/**
	 * コンストラクタ
	 * @param cell 値の取得元Cell読み込み定義
	 * @param config コンバーターのコンフィグ
	 */
	public LowerCamel(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object applyToString(String value, ContentInterface<?, ?> content) {
		return format(value, CaseFormat.LOWER_CAMEL);
	}
}
