package com.purejadeite.genee.option.cell;

import static com.purejadeite.util.collection.RoughlyMapUtils.*;

import java.util.Map;

import org.apache.commons.codec.binary.StringUtils;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;

/**
 * 文字列のバイト長を取得するクラス
 * @author mitsuhiroseino
 *
 */
public class ByteLength extends AbstractStringCellOption {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7760427610936216547L;

	private static final String CFG_ENCODE = "encode";

	/**
	 * エンコード
	 */
	protected String encode;

	/**
	 * コンストラクタ
	 * @param cell 値の取得元Cell読み込み定義
	 * @param config コンバーターのコンフィグ
	 */
	public ByteLength(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
		this.encode = getString(config, CFG_ENCODE);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object applyToString(String value, ContentInterface<?, ?> content) {
		return Integer.valueOf(StringUtils.getBytesUnchecked(value, encode).length);
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("encode", encode);
		return map;
	}

}
