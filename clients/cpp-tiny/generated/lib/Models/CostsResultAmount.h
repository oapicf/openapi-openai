
/*
 * CostsResult_amount.h
 *
 * The monetary value in its associated currency.
 */

#ifndef TINY_CPP_CLIENT_CostsResult_amount_H_
#define TINY_CPP_CLIENT_CostsResult_amount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The monetary value in its associated currency.
 *
 *  \ingroup Models
 *
 */

class CostsResult_amount{
public:

    /*! \brief Constructor.
	 */
    CostsResult_amount();
    CostsResult_amount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CostsResult_amount();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The numeric value of the cost.
	 */
	long getValue();

	/*! \brief Set The numeric value of the cost.
	 */
	void setValue(long  value);
	/*! \brief Get Lowercase ISO-4217 currency e.g. \"usd\"
	 */
	std::string getCurrency();

	/*! \brief Set Lowercase ISO-4217 currency e.g. \"usd\"
	 */
	void setCurrency(std::string  currency);


    private:
    long value{};
    std::string currency{};
};
}

#endif /* TINY_CPP_CLIENT_CostsResult_amount_H_ */
