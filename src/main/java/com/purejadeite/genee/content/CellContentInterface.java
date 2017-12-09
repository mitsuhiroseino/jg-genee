package com.purejadeite.genee.content;

import com.purejadeite.genee.definition.cell.CellDefinitionInterface;

/**
 * Cellの値取得インターフェイス
 * @author mitsuhiroseino
 */
public interface CellContentInterface<P extends ContentInterface<?, ?>, D extends CellDefinitionInterface<?, ?>> extends ContentInterface<P, D> {
}
