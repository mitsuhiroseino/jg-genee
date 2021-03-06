package com.purejadeite.genee.generator;

import static com.purejadeite.util.collection.RoughlyMapUtils.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import com.purejadeite.genee.content.ContentInterface;
import com.purejadeite.genee.definition.DefinitionInterface;

/**
 * Indexを生成するクラス
 * @author mitsuhiroseino
 *
 */
public class Index extends AbstractRelatedValueGenerator {

	private static final long serialVersionUID = -9188313601218449958L;

	protected static final String CFG_FROM = "from";

	protected static final String CFG_INCREMENT = "increment";

	protected int from = 0;

	protected int increment = 1;

	/**
	 * コンストラクタ
	 * @param cell 値の取得元Cell読み込み定義
	 * @param config コンバーターのコンフィグ
	 */
	public Index(DefinitionInterface<?> definition, Map<String, Object> config) {
		super(definition);
		from = getIntValue(config, CFG_FROM, 0);
		Integer increment = getInteger(config, CFG_INCREMENT, 1);
		this.increment = increment.intValue();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object generate(Object value, ContentInterface<?, ?> content) {
		return applyImpl(value, content);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Object applyImpl(Object value, ContentInterface<?, ?> content) {
		if (value instanceof Collection) {
			// table cellの場合
			@SuppressWarnings("unchecked")
			Collection<Object> values = (Collection<Object>) value;
			Collection<Object> vals = new ArrayList<>();
			int index = from;
			for (int i = 0; i < values.size(); i++) {
				vals.add(Integer.valueOf(index));
				index += increment;
			}
			return vals;
		} else {
			// 単独のcellの場合
			return Integer.valueOf(from);
		}
	}

	@Override
	public Map<String, Object> toMap() {
		Map<String, Object> map = super.toMap();
		map.put("from", from);
		map.put("increment", increment);
		return map;
	}
}
