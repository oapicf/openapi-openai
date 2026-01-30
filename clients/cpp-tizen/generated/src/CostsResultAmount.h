/*
 * CostsResult_amount.h
 *
 * The monetary value in its associated currency.
 */

#ifndef _CostsResult_amount_H_
#define _CostsResult_amount_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The monetary value in its associated currency.
 *
 *  \ingroup Models
 *
 */

class CostsResult_amount : public Object {
public:
	/*! \brief Constructor.
	 */
	CostsResult_amount();
	CostsResult_amount(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CostsResult_amount();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The numeric value of the cost.
	 */
	long long getValue();

	/*! \brief Set The numeric value of the cost.
	 */
	void setValue(long long  value);
	/*! \brief Get Lowercase ISO-4217 currency e.g. \"usd\"
	 */
	std::string getCurrency();

	/*! \brief Set Lowercase ISO-4217 currency e.g. \"usd\"
	 */
	void setCurrency(std::string  currency);

private:
	long long value;
	std::string currency;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CostsResult_amount_H_ */
