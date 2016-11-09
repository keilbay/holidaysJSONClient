/**
 * 
 */
package ociv.holiday.client.HolidayClient.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * @author keil
 *
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Holiday {
	
	private HoldidayDate date;
	
	private String localName;
	
	private String englishName;

	public Holiday() {
		
	}

	public HoldidayDate getDate() {
		return date;
	}

	public void setDate(HoldidayDate date) {
		this.date = date;
	}

	public String getLocalName() {
		return localName;
	}

	public void setLocalName(String localName) {
		this.localName = localName;
	}

	public String getEnglishName() {
		return englishName;
	}

	public void setEnglishName(String englishName) {
		this.englishName = englishName;
	}	
	
}
