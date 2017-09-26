/*
 * This file is generated by jOOQ.
*/
package org.jooq.examples.skala.h2.tables


import java.lang.Class
import java.lang.Integer
import java.lang.String
import java.sql.Date
import java.util.Arrays
import java.util.List

import javax.annotation.Generated

import org.jooq.Field
import org.jooq.Index
import org.jooq.Name
import org.jooq.Schema
import org.jooq.Table
import org.jooq.TableField
import org.jooq.UniqueKey
import org.jooq.examples.skala.h2.Indexes
import org.jooq.examples.skala.h2.Keys
import org.jooq.examples.skala.h2.Public
import org.jooq.examples.skala.h2.tables.records.TAuthorRecord
import org.jooq.impl.DSL
import org.jooq.impl.TableImpl

import scala.Array


object TAuthor {

  /**
   * The reference instance of <code>PUBLIC.T_AUTHOR</code>
   */
  val T_AUTHOR = new TAuthor
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
class TAuthor(alias : Name, aliased : Table[TAuthorRecord], parameters : Array[ Field[_] ]) extends TableImpl[TAuthorRecord](alias, Public.PUBLIC, aliased, parameters, "") {

  /**
   * The class holding records for this type
   */
  override def getRecordType : Class[TAuthorRecord] = {
    classOf[TAuthorRecord]
  }

  /**
   * The column <code>PUBLIC.T_AUTHOR.ID</code>.
   */
  val ID : TableField[TAuthorRecord, Integer] = createField("ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false), "")

  /**
   * The column <code>PUBLIC.T_AUTHOR.FIRST_NAME</code>.
   */
  val FIRST_NAME : TableField[TAuthorRecord, String] = createField("FIRST_NAME", org.jooq.impl.SQLDataType.VARCHAR(50), "")

  /**
   * The column <code>PUBLIC.T_AUTHOR.LAST_NAME</code>.
   */
  val LAST_NAME : TableField[TAuthorRecord, String] = createField("LAST_NAME", org.jooq.impl.SQLDataType.VARCHAR(50).nullable(false), "")

  /**
   * The column <code>PUBLIC.T_AUTHOR.DATE_OF_BIRTH</code>.
   */
  val DATE_OF_BIRTH : TableField[TAuthorRecord, Date] = createField("DATE_OF_BIRTH", org.jooq.impl.SQLDataType.DATE, "")

  /**
   * The column <code>PUBLIC.T_AUTHOR.YEAR_OF_BIRTH</code>.
   */
  val YEAR_OF_BIRTH : TableField[TAuthorRecord, Integer] = createField("YEAR_OF_BIRTH", org.jooq.impl.SQLDataType.INTEGER, "")

  /**
   * The column <code>PUBLIC.T_AUTHOR.ADDRESS</code>.
   */
  val ADDRESS : TableField[TAuthorRecord, String] = createField("ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(50), "")

  /**
   * Create a <code>PUBLIC.T_AUTHOR</code> table reference
   */
  def this() = {
    this(DSL.name("T_AUTHOR"), null, null)
  }

  /**
   * Create an aliased <code>PUBLIC.T_AUTHOR</code> table reference
   */
  def this(alias : String) = {
    this(DSL.name(alias), org.jooq.examples.skala.h2.tables.TAuthor.T_AUTHOR, null)
  }

  /**
   * Create an aliased <code>PUBLIC.T_AUTHOR</code> table reference
   */
  def this(alias : Name) = {
    this(alias, org.jooq.examples.skala.h2.tables.TAuthor.T_AUTHOR, null)
  }

  private def this(alias : Name, aliased : Table[TAuthorRecord]) = {
    this(alias, aliased, null)
  }

  override def getSchema : Schema = Public.PUBLIC

  override def getIndexes : List[ Index ] = {
    return Arrays.asList[ Index ](Indexes.PRIMARY_KEY_2)
  }

  override def getPrimaryKey : UniqueKey[TAuthorRecord] = {
    Keys.PK_T_AUTHOR
  }

  override def getKeys : List[ UniqueKey[TAuthorRecord] ] = {
    return Arrays.asList[ UniqueKey[TAuthorRecord] ](Keys.PK_T_AUTHOR)
  }

  override def as(alias : String) : TAuthor = {
    new TAuthor(DSL.name(alias), this)
  }

  override def as(alias : Name) : TAuthor = {
    new TAuthor(alias, this)
  }

  /**
   * Rename this table
   */
  override def rename(name : String) : TAuthor = {
    new TAuthor(DSL.name(name), null)
  }

  /**
   * Rename this table
   */
  override def rename(name : Name) : TAuthor = {
    new TAuthor(name, null)
  }
}
