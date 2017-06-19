/**
 * Axelor Business Solutions
 *
 * Copyright (C) 2017 Axelor (<http://axelor.com>).
 *
 * This program is free software: you can redistribute it and/or  modify
 * it under the terms of the GNU Affero General Public License, version 3,
 * as published by the Free Software Foundation.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.axelor.studio.utils;

import java.util.Arrays;
import java.util.List;

public class Namming {

	/**
	 * Check whether the given name is Java reserved keyword.
	 * 
	 */
	public static boolean isReserved(String name) {
		return RESERVED_JAVA.contains(name);
	}

	/**
	 * Check whether the given name is SQL reserved keyword.
	 * 
	 */
	public static boolean isKeyword(String name) {
		return RESERVED_POSTGRESQL.contains(name)
				|| RESERVED_MYSQL.contains(name)
				|| RESERVED_ORACLE.contains(name);
	}

	/**
	 * Quote the given column name.
	 * 
	 */
	public static String quoteColumn(String name) {
		return "`" + name + "`";
	}

	// Java Keywords
	private static final List<String> RESERVED_JAVA = Arrays
			.asList(new String[] { "abstract", "assert", "boolean", "break",
					"byte", "case", "catch", "char", "class", "const",
					"continue", "default", "do", "double", "else", "enum",
					"extends", "final", "finally", "float", "for", "goto",
					"if", "implements", "import", "instanceof", "int",
					"interface", "long", "native", "new", "package", "private",
					"protected", "public", "return", "short", "static",
					"strictfp", "super", "switch", "synchronized", "this",
					"throw", "throws", "transient", "try", "void", "volatile",
					"while" });

	// PostgreSQL 9.x
	private static final List<String> RESERVED_POSTGRESQL = Arrays
			.asList(new String[] { "all", "analyse", "analyze", "and", "any",
					"array", "as", "asc", "asymmetric", "both", "case", "cast",
					"check", "collate", "column", "constraint", "create",
					"current_catalog", "current_date", "current_role",
					"current_time", "current_timestamp", "current_user",
					"default", "deferrable", "desc", "distinct", "do", "else",
					"end", "except", "false", "fetch", "for", "foreign",
					"from", "grant", "group", "having", "in", "initially",
					"intersect", "into", "lateral", "leading", "limit",
					"localtime", "localtimestamp", "not", "null", "offset",
					"on", "only", "or", "order", "placing", "primary",
					"references", "returning", "select", "session_user",
					"some", "symmetric", "table", "then", "to", "trailing",
					"true", "union", "unique", "user", "using", "variadic",
					"when", "where", "window", "with" });

	// MariaDB 10.x & MySQL 5.5
	private static final List<String> RESERVED_MYSQL = Arrays
			.asList(new String[] { "accessible", "add", "all", "alter",
					"analyze", "and", "as", "asc", "asensitive", "before",
					"between", "bigint", "binary", "blob", "both", "by",
					"call", "cascade", "case", "change", "char", "character",
					"check", "collate", "column", "condition", "constraint",
					"continue", "convert", "create", "cross", "current_date",
					"current_time", "current_timestamp", "current_user",
					"cursor", "database", "databases", "day_hour",
					"day_microsecond", "day_minute", "day_second", "dec",
					"decimal", "declare", "default", "delayed", "delete",
					"desc", "describe", "deterministic", "distinct",
					"distinctrow", "div", "double", "drop", "dual", "each",
					"else", "elseif", "enclosed", "escaped", "exists", "exit",
					"explain", "false", "fetch", "float", "float4", "float8",
					"for", "force", "foreign", "from", "fulltext", "grant",
					"group", "having", "high_priority", "hour_microsecond",
					"hour_minute", "hour_second", "if", "ignore", "in",
					"index", "infile", "inner", "inout", "insensitive",
					"insert", "int", "int1", "int2", "int3", "int4", "int8",
					"integer", "interval", "into", "is", "iterate", "join",
					"key", "keys", "kill", "leading", "leave", "left", "like",
					"limit", "linear", "lines", "load", "localtime",
					"localtimestamp", "lock", "long", "longblob", "longtext",
					"loop", "low_priority", "master_ssl_verify_server_cert",
					"match", "maxvalue", "mediumblob", "mediumint",
					"mediumtext", "middleint", "minute_microsecond",
					"minute_second", "mod", "modifies", "natural", "not",
					"no_write_to_binlog", "null", "numeric", "on", "optimize",
					"option", "optionally", "or", "order", "out", "outer",
					"outfile", "precision", "primary", "procedure", "purge",
					"range", "read", "reads", "read_write", "real",
					"references", "regexp", "release", "rename", "repeat",
					"replace", "require", "resignal", "restrict", "return",
					"revoke", "right", "rlike", "schema", "schemas",
					"second_microsecond", "select", "sensitive", "separator",
					"set", "show", "signal", "smallint", "spatial", "specific",
					"sql", "sql_big_result", "sql_calc_found_rows",
					"sqlexception", "sql_small_result", "sqlstate",
					"sqlwarning", "ssl", "starting", "straight_join", "table",
					"terminated", "then", "tinyblob", "tinyint", "tinytext",
					"to", "trailing", "trigger", "true", "undo", "union",
					"unique", "unlock", "unsigned", "update", "usage", "use",
					"using", "utc_date", "utc_time", "utc_timestamp", "values",
					"varbinary", "varchar", "varcharacter", "varying", "when",
					"where", "while", "with", "write", "xor", "year_month",
					"zerofill" });

	// Oracle
	private static final List<String> RESERVED_ORACLE = Arrays
			.asList(new String[] { "access", "add", "all", "alter", "and",
					"any", "arraylen", "as", "asc", "audit", "between", "by",
					"char", "check", "cluster", "column", "comment",
					"compress", "connect", "create", "current", "date",
					"decimal", "default", "delete", "desc", "distinct", "drop",
					"else", "exclusive", "exists", "file", "float", "for",
					"from", "grant", "group", "having", "identified",
					"immediate", "in", "increment", "index", "initial",
					"insert", "integer", "intersect", "into", "is", "level",
					"like", "lock", "long", "maxextents", "minus", "mode",
					"modify", "noaudit", "nocompress", "not", "notfound",
					"nowait", "null", "number", "of", "offline", "on",
					"online", "option", "or", "order", "pctfree", "prior",
					"privileges", "public", "raw", "rename", "resource",
					"revoke", "row", "rowid", "rowlabel", "rownum", "rows",
					"select", "session", "set", "share", "size", "smallint",
					"sqlbuf", "start", "successful", "synonym", "sysdate",
					"table", "then", "to", "trigger", "uid", "union", "unique",
					"update", "user", "validate", "values", "varchar",
					"varchar2", "view", "whenever", "where", "with" });
}
