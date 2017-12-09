package com.purejadeite.genee.option.cell;

import static com.purejadeite.util.collection.RoughlyMapUtils.*;

import java.util.List;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;

/**
 * 値を追加するクラス
 *
 * @author mitsuhiroseino
 *
 */
public class AddValue extends AbstractListCellOption {

	protected static final String CFG_UNIQUE = "unique";

	protected static final String CFG_VALUE = "value";

	/**
	 * 一意
	 */
	protected boolean unique;

	/**
	 * 追加する値
	 */
	protected String value;

	/**
	 * コンストラクタ
	 *
	 * @param cell
	 *            値の取得元Cell読み込み定義
	 * @param config
	 *            コンバーターのコンフィグ
	 */
	public AddValue(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
		this.unique = getBooleanValue(config, CFG_UNIQUE);
		this.value = getString(config, CFG_VALUE);
	}

	public Object applyImpl(List<Object> values, ContentInterface<?, ?> content) {
		if (!unique || !values.contains(this.value)) {
			values.add(this.value);
		}
		return values;
	}

	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("unique", unique);
		return map;
	}

}
