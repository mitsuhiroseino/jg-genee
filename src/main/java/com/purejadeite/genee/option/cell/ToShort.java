package com.purejadeite.genee.option.cell;

import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.input.sxssf.SxssfUtils;

/**
 * 文字列を Short へ変換するクラス
 * @author mitsuhiroseino
 *
 */
public class ToShort extends AbstractStringCellOption {

	private static final long serialVersionUID = -6247020802769039046L;

	/**
	 * コンストラクタ
	 * @param cell 値の取得元Cell読み込み定義
	 * @param config コンバーターのコンフィグ
	 */
	public ToShort(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object applyToString(String value, ContentInterface<?, ?> content) {
		return SxssfUtils.getShort(value);
	}

}
