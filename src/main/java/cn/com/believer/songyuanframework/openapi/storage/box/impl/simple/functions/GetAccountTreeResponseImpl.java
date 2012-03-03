/**
 * Mule Box.Net Cloud Connector
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * All rights reserved.
 */
package cn.com.believer.songyuanframework.openapi.storage.box.impl.simple.functions;

import javax.swing.tree.DefaultMutableTreeNode;

import cn.com.believer.songyuanframework.openapi.storage.box.functions.GetAccountTreeResponse;

/**
 * @author Jimmy
 * 
 */
public class GetAccountTreeResponseImpl extends BoxResponseImpl implements
        GetAccountTreeResponse {

    /**
     * a Java Swing tree structure, and each of tree node attached a
     * BoxAbstractFile object, wich can be either file or folder.
     */
    private DefaultMutableTreeNode tree;

    /** base64 encoded string of XML content. */
    private String encodedTree;

    /**
     * @return the tree
     */
    public DefaultMutableTreeNode getTree() {
        return this.tree;
    }

    /**
     * @param tree
     *            the tree to set
     */
    public void setTree(DefaultMutableTreeNode tree) {
        this.tree = tree;
    }

    /**
     * @return the encodedTree
     */
    public String getEncodedTree() {
        return this.encodedTree;
    }

    /**
     * @param encodedTree
     *            the encodedTree to set
     */
    public void setEncodedTree(String encodedTree) {
        this.encodedTree = encodedTree;
    }
}
