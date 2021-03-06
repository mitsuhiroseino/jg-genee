package com.purejadeite.genee.definition.cell;

import java.util.Map;

import com.purejadeite.genee.definition.ParentDefinitionInterface;

/**
 * <pre>
 * 値の取得元セルの情報を保持する抽象クラス
 * </pre>
 *
 * @author mitsuhiroseino
 */
abstract public class AbstractNoAdressCellDefinition<P extends ParentDefinitionInterface<?, ?>, V> extends AbstractCellDefinition<P, V> {

	private static final long serialVersionUID = 5276446229482797364L;

	/**
	 * コンストラクタ
	 *
	 * @param parent
	 *            親定義
	 * @param config
	 *            コンフィグ
	 */
	protected AbstractNoAdressCellDefinition(P parent, Map<String, Object> config) {
		super(parent, config);
	}

}
