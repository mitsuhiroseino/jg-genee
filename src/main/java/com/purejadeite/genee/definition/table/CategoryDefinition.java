package com.purejadeite.genee.definition.table;

import java.util.Map;

import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.definition.ParentDefinitionInterface;

/**
 * 任意の集まりを保持するクラスの抽象クラスです
 * @author mitsuhiroseino
 */
public class CategoryDefinition extends AbstractCategoryDefinition<DefinitionInterface<?>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8237291845407830306L;
	
	public static final String CFG_CELLS = "cells";

	/**
	 * コンストラクタ
	 * @param parent 親の読み込み情報
	 * @param config コンフィグ
	 */
	public CategoryDefinition(ParentDefinitionInterface<?, ?> parent, Map<String, Object> config) {
		super(parent, config);
	}

	public static boolean assess(Map<String, Object> config, ParentDefinitionInterface<?, ?> table) {
		return config.containsKey(CFG_CELLS);
	}

}
