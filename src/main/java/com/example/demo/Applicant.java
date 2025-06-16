package com.example.demo;

import java.util.Objects;

public class Applicant {

	private Long identificationNumber;
	private String firstName;
	private String middleName;
	private String lastName;
	private String customerLang;
	private String customerType;

	public Applicant(Long identificationNumber, String firstName, String middleName, String lastName,
			String customerLang, String customerType) {
		super();
		this.identificationNumber = identificationNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.customerLang = customerLang;
		this.customerType = customerType;
	}

	/**
	 * @return the identificationNumber
	 */
	public Long getIdentificationNumber() {
		return identificationNumber;
	}

	/**
	 * @param identificationNumber the identificationNumber to set
	 */
	public void setIdentificationNumber(Long identificationNumber) {
		this.identificationNumber = identificationNumber;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the middleName
	 */
	public String getMiddleName() {
		return middleName;
	}

	/**
	 * @param middleName the middleName to set
	 */
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the customerLang
	 */
	public String getCustomerLang() {
		return customerLang;
	}

	/**
	 * @param customerLang the customerLang to set
	 */
	public void setCustomerLang(String customerLang) {
		this.customerLang = customerLang;
	}

	/**
	 * @return the customerType
	 */
	public String getCustomerType() {
		return customerType;
	}

	/**
	 * @param customerType the customerType to set
	 */
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}

	@Override
	public int hashCode() {
		return Objects.hash(customerLang, customerType, firstName, identificationNumber, lastName, middleName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Applicant other = (Applicant) obj;
		return Objects.equals(customerLang, other.customerLang) && Objects.equals(customerType, other.customerType)
				&& Objects.equals(firstName, other.firstName)
				&& Objects.equals(identificationNumber, other.identificationNumber)
				&& Objects.equals(lastName, other.lastName) && Objects.equals(middleName, other.middleName);
	}

	@Override
	public String toString() {
		return "Applicant [identificationNumber=" + identificationNumber + ", firstName=" + firstName + ", middleName="
				+ middleName + ", lastName=" + lastName + ", customerLang=" + customerLang + ", customerType="
				+ customerType + "]";
	}

}
