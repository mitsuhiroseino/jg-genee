package com.purejadeite.genee.definition.table;

import com.purejadeite.genee.definition.DefinitionInterface;
import com.purejadeite.genee.definition.ParentDefinitionInterface;

/**
 * 任意の集まりを保持するクラスのインターフェイスです
 * @author mitsuhiroseino
 */
public interface CategoryDefinitionInterface<C extends DefinitionInterface<?>> extends ParentDefinitionInterface<ParentDefinitionInterface<?, ?>, C> {
}
