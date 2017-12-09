package com.purejadeite.genee.content;

import com.purejadeite.genee.definition.table.TableDefinitionInterface;

/**
 * テーブル形式の範囲の情報を保持するクラスのインターフェイスです
 * @author mitsuhiroseino
 */
public interface TableContentInterface extends ParentContentInterface<ParentContentInterface<?, ?, ?>, TableCellContentInterface<?>, TableDefinitionInterface<?>> {
	public int size();
}
