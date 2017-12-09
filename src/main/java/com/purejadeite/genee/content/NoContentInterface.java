package com.purejadeite.genee.content;

import com.purejadeite.genee.definition.NoDefinitionInterface;

/**
 * なにも無い定義のインターフェイス
 * @author mitsuhiroseino
 */
public interface NoContentInterface<P extends NoContentInterface<P>> extends ParentContentInterface<NoContentInterface<?>, ContentInterface<?, ?>, NoDefinitionInterface> {
}
