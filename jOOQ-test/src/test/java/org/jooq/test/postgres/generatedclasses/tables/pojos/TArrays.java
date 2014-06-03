/**
 * This class is generated by jOOQ
 */
package org.jooq.test.postgres.generatedclasses.tables.pojos;

/**
 * This class is generated by jOOQ.
 */
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class TArrays implements org.jooq.test.postgres.generatedclasses.tables.interfaces.ITArrays {

	private static final long serialVersionUID = 1425507789;

	private final java.lang.Integer                                                       id;
	private final java.lang.String[]                                                      stringArray;
	private final java.lang.Integer[]                                                     numberArray;
	private final java.sql.Date[]                                                         dateArray;
	private final org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] udtArray;
	private final org.jooq.test.postgres.generatedclasses.enums.UCountry[]                enumArray;
	private final java.lang.Integer[]                                                     arrayArray;
	private final java.lang.String[]                                                      numberList;
	private final java.lang.String[]                                                      stringList;
	private final java.lang.String[]                                                      dateList;

	public TArrays(
		java.lang.Integer                                                       id,
		java.lang.String[]                                                      stringArray,
		java.lang.Integer[]                                                     numberArray,
		java.sql.Date[]                                                         dateArray,
		org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] udtArray,
		org.jooq.test.postgres.generatedclasses.enums.UCountry[]                enumArray,
		java.lang.Integer[]                                                     arrayArray,
		java.lang.String[]                                                      numberList,
		java.lang.String[]                                                      stringList,
		java.lang.String[]                                                      dateList
	) {
		this.id = id;
		this.stringArray = stringArray;
		this.numberArray = numberArray;
		this.dateArray = dateArray;
		this.udtArray = udtArray;
		this.enumArray = enumArray;
		this.arrayArray = arrayArray;
		this.numberList = numberList;
		this.stringList = stringList;
		this.dateList = dateList;
	}

	@Override
	public java.lang.Integer getId() {
		return this.id;
	}

	@Override
	public java.lang.String[] getStringArray() {
		return this.stringArray;
	}

	@Override
	public java.lang.Integer[] getNumberArray() {
		return this.numberArray;
	}

	@Override
	public java.sql.Date[] getDateArray() {
		return this.dateArray;
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.udt.records.UStreetTypeRecord[] getUdtArray() {
		return this.udtArray;
	}

	@Override
	public org.jooq.test.postgres.generatedclasses.enums.UCountry[] getEnumArray() {
		return this.enumArray;
	}

	@Override
	public java.lang.Integer[] getArrayArray() {
		return this.arrayArray;
	}

	@Override
	public java.lang.String[] getNumberList() {
		return this.numberList;
	}

	@Override
	public java.lang.String[] getStringList() {
		return this.stringList;
	}

	@Override
	public java.lang.String[] getDateList() {
		return this.dateList;
	}
}
