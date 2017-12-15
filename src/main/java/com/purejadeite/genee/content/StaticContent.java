package com.purejadeite.genee.content;

import com.purejadeite.genee.definition.cell.CellDefinitionInterface;

/**
 * セルの値を保持するクラス
 * @author mitsuhiroseino
 */
public class StaticContent extends AbstractSingleValueContent<CellDefinitionInterface<?, ?>> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6994802245540048317L;

	/**
	 * コンストラクタ
	 * @param parent 親コンテンツ
	 * @param definition 定義
	 */
	public StaticContent(SheetContent parent, CellDefinitionInterface<?, ?> definition) {
		super(parent, definition);
	}

}
