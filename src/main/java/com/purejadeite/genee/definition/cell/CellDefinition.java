package com.purejadeite.genee.definition.cell;

import static com.purejadeite.util.collection.RoughlyMapUtils.*;

import java.util.Map;

import com.purejadeite.genee.definition.ParentDefinitionInterface;
import com.purejadeite.util.collection.Table;

/**
 * 単一セルの読み込み定義です
 *
 * @author mitsuhiroseino
 */
public class CellDefinition extends AbstractCellDefinition<ParentDefinitionInterface<?, ?>, Object> {

	private static final long serialVersionUID = -6196528307255166352L;

	/**
	 * 取得対象列
	 */
	protected int row = 0;

	/**
	 * 取得対象行
	 */
	protected int col = 0;

	/**
	 * コンストラクタ
	 *
	 * @param parent
	 *            親定義
	 * @param config
	 *            コンフィグ
	 */
	public CellDefinition(ParentDefinitionInterface<?, ?> parent, Map<String, Object> config) {
		super(parent, config);
		col = getIntValue(config, CFG_COLUMN);
		row = getIntValue(config, CFG_ROW);
	}

	public static boolean assess(Map<String, Object> config, ParentDefinitionInterface<?, ?> table) {
		return (config.containsKey(CFG_COLUMN) && config.containsKey(CFG_ROW));
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("row", row);
		map.put("col", col);
		return map;
	}

	@Override
	public Object capture(Table<String> table) {
		return table.get(row - 1, col - 1);
	}

}
