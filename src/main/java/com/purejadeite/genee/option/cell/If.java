package com.purejadeite.genee.option.cell;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.content.SpecificValue;
import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.option.AbstactIf;
import com.purejadeite.genee.option.Options;
import com.purejadeite.util.SimpleValidator;

/**
 * オプション実行条件オプション
 *
 * @author mitsuhiroseino
 *
 */
public class If extends AbstactIf implements CellOptionInterface, Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1117363831796541233L;
	
	/**
	 * 必須項目名称
	 */
	private static final String[] CONFIG = {};

	/**
	 * コンストラクタ
	 *
	 * @param config
	 *            コンバーターのコンフィグ
	 */
	public If(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition, config);
		SimpleValidator.containsKey(config, CONFIG);
	}

	@Override
	public Object apply(Object cellValue, ContentInterface<?, ?> content) {
		if (cellValue == SpecificValue.UNDEFINED) {
			return cellValue;
		} else {
			return applyImpl(cellValue, content);
		}
	}

	protected Object applyImpl(Object cellValue, ContentInterface<?, ?> content) {
		if (evaluate(cellValue)) {
			return thenOptions.apply(cellValue, content);
		} else {
			if (thenOptions == null) {
				return cellValue;
			} else {
				return elseOptions.apply(cellValue, content);
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		return map;
	}

	@Override
	protected Options buildOptions(DefinitionInterface<?> definition, List<Map<String, Object>> options) {
		return CellOptionManager.build(definition, options);
	}

}