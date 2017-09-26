/*
 * This file is generated by jOOQ.
*/
package org.jooq.examples.skala.h2.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.sql.Timestamp
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.Name
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.examples.skala.h2.Indexes
import org.jooq.examples.skala.h2.Keys
import org.jooq.examples.skala.h2.Public
import org.jooq.examples.skala.h2.tables.records.TBookRecord
import org.jooq.impl.DSL
import org.jooq.impl.TableImpl

import scala.Array
import scala.Byte


object TBook {

  /**
   * The reference instance of <code>PUBLIC.T_BOOK</code>
   */
  val T_BOOK = new TBook
}

/**
 * This class is generated by jOOQ.
 */
@Generated(
  value = Array(
    "http://www.jooq.org",
    "jOOQ version:3.10.0"
  ),
  comments = "This class is generated by jOOQ"
)
class TBook(alias : Name, aliased : Table[TBookRecord], parameters : Array[ Field[_] ]) extends TableImpl[TBookRecord](alias, Public.PUBLIC, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TBookRecord] = {
    classOf[TBookRecord]
  }

  /**
   * The column <code>PUBLIC.T_BOOK.ID</code>.
   */
  val ID : TableField[TBookRecord, Integer] = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>PUBLIC.T_BOOK.AUTHOR_ID</code>.
   */
  val AUTHOR_ID : TableField[TBookRecord, Integer] = createField("AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>PUBLIC.T_BOOK.CO_AUTHOR_ID</code>.
   */
  val CO_AUTHOR_ID : TableField[TBookRecord, Integer] = createField("CO_AUTHOR_ID", org.jooq.impl.SQLDataType.INTEGER, "")

  /**
   * The column <code>PUBLIC.T_BOOK.DETAILS_ID</code>.
   */
  val DETAILS_ID : TableField[TBookRecord, Integer] = createField("DETAILS_ID", org.jooq.impl.SQLDataType.INTEGER, "")

  /**
   * The column <code>PUBLIC.T_BOOK.TITLE</code>.
   */
  val TITLE : TableField[TBookRecord, String] = createField("TITLE", org.jooq.impl.SQLDataType.VARCHAR(400).nullable(false), "")

  /**
   * The column <code>PUBLIC.T_BOOK.PUBLISHED_IN</code>.
   */
  val PUBLISHED_IN : TableField[TBookRecord, Integer] = createField("PUBLISHED_IN", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>PUBLIC.T_BOOK.LANGUAGE_ID</code>.
   */
  val LANGUAGE_ID : TableField[TBookRecord, Integer] = createField("LANGUAGE_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>PUBLIC.T_BOOK.CONTENT_TEXT</code>.
   */
  val CONTENT_TEXT : TableField[TBookRecord, String] = createField("CONTENT_TEXT", org.jooq.impl.SQLDataType.CLOB, "")

  /**
   * The column <code>PUBLIC.T_BOOK.CONTENT_PDF</code>.
   */
  val CONTENT_PDF : TableField[TBookRecord, Array[Byte]] = createField("CONTENT_PDF", org.jooq.impl.SQLDataType.BLOB, "")

  /**
   * The column <code>PUBLIC.T_BOOK.REC_VERSION</code>.
   */
  val REC_VERSION : TableField[TBookRecord, Integer] = createField("REC_VERSION", org.jooq.impl.SQLDataType.INTEGER, "")

  /**
   * The column <code>PUBLIC.T_BOOK.REC_TIMESTAMP</code>.
   */
  val REC_TIMESTAMP : TableField[TBookRecord, Timestamp] = createField("REC_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP, "")

  /**
   * Create a <code>PUBLIC.T_BOOK</code> table reference
   */
  def this() = {
    this(DSL.name("T_BOOK"), null, null)
  }

  /**
   * Create an aliased <code>PUBLIC.T_BOOK</code> table reference
   */
  def this(alias : String) = {
    this(DSL.name(alias), org.jooq.examples.skala.h2.tables.TBook.T_BOOK, null)
  }

  /**
   * Create an aliased <code>PUBLIC.T_BOOK</code> table reference
   */
  def this(alias : Name) = {
    this(alias, org.jooq.examples.skala.h2.tables.TBook.T_BOOK, null)
  }

  private def this(alias : Name, aliased : Table[TBookRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Public.PUBLIC

  override def getIndexes : List[ Index ] = {
    return Arrays.asList[ Index ](Indexes.FK_T_BOOK_AUTHOR_ID_INDEX_9, Indexes.FK_T_BOOK_CO_AUTHOR_ID_INDEX_9, Indexes.PRIMARY_KEY_9)
  }

  override def getPrimaryKey : UniqueKey[TBookRecord] = {
    Keys.PK_T_BOOK
  }

  override def getKeys : List[ UniqueKey[TBookRecord] ] = {
    return Arrays.asList[ UniqueKey[TBookRecord] ](Keys.PK_T_BOOK)
  }

  override def getReferences : List[ ForeignKey[TBookRecord, _] ] = {
    return Arrays.asList[ ForeignKey[TBookRecord, _] ](Keys.FK_T_BOOK_AUTHOR_ID, Keys.FK_T_BOOK_CO_AUTHOR_ID)
  }

  override def as(alias : String) : TBook = {
    new TBook(DSL.name(alias), this)
  }

  override def as(alias : Name) : TBook = {
    new TBook(alias, this)
  }

  /**
   * Rename this table
   */
  override def rename(name : String) : TBook = {
    new TBook(DSL.name(name), null)
  }

  /**
   * Rename this table
   */
  override def rename(name : Name) : TBook = {
    new TBook(name, null)
  }
}
