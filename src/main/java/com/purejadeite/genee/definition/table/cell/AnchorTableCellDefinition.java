package com.purejadeite.genee.definition.table.cell;

import java.util.List;
import java.util.Map;

import com.purejadeite.genee.definition.ParentDefinitionInterface;
import com.purejadeite.genee.definition.table.TableDefinitionInterface;
import com.purejadeite.util.collection.Table;

/**
 * オプションなどが値の作成先にする仮想Cellの定義です
 *
 * @author mitsuhiroseino
 */
public class AnchorTableCellDefinition<P extends TableDefinitionInterface<?>> extends AbstractNoAdressTableCellDefinition<P, List<Object>> {

	/**
	 * コンストラクタ
	 *
	 * @param parent
	 *            親定義
	 * @param config
	 *            コンフィグ
	 */
	public AnchorTableCellDefinition(P parent, Map<String, Object> config) {
		super(parent, config);
	}

	public static boolean assess(Map<String, Object> config, ParentDefinitionInterface<?, ?> table) {
		return (config.containsKey(CFG_ID) && config.size() == 1) || (config.containsKey(CFG_ID) && config.containsKey(CFG_NAME) && config.size() == 2);
	}

	@Override
	public List<Object> capture(Table<String> table) {
		return null;
	}

	@Override
	public List<Object> capture(Table<String> table, int size) {
		return null;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		return map;
	}

}
