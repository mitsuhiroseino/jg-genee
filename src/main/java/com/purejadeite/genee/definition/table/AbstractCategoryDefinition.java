package com.purejadeite.genee.definition.table;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.definition.AbstractParentDefinition;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.definition.ParentDefinitionInterface;
import com.purejadeite.genee.option.table.TableOptionManager;

/**
 * 任意の集まりを表わすクラスの抽象クラスです
 * @author mitsuhiroseino
 */
abstract public class AbstractCategoryDefinition<C extends DefinitionInterface<?>> extends AbstractParentDefinition<ParentDefinitionInterface<?, ?>, C> implements CategoryDefinitionInterface<C> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3826055242574796490L;

	/**
	 * コンストラクタ
	 *
	 * @param parent
	 *            親定義
	 * @param config
	 *            コンフィグ
	 */
	protected AbstractCategoryDefinition(ParentDefinitionInterface<?, ?> parent, Map<String, Object> config) {
		super(parent, config);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void buildOptions(DefinitionInterface<?> definition, List<Map<String, Object>> options) {
		this.options = TableOptionManager.build(definition, options);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CategoryDefinitionInterface<?> getCategory() {
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		if (children != null) {
			List<Map<String, Object>> cellMaps = new ArrayList<>();
			for(C child: children) {
				cellMaps.add(child.toMap());
			}
			map.put("cells", cellMaps);
		}
		return map;
	}
}
