
/*
 * CostsResult.h
 *
 * The aggregated costs details of the specific time bucket.
 */

#ifndef TINY_CPP_CLIENT_CostsResult_H_
#define TINY_CPP_CLIENT_CostsResult_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CostsResult_amount.h"

namespace Tiny {


/*! \brief The aggregated costs details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class CostsResult{
public:

    /*! \brief Constructor.
	 */
    CostsResult();
    CostsResult(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CostsResult();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	CostsResult_amount getAmount();

	/*! \brief Set 
	 */
	void setAmount(CostsResult_amount  amount);
	/*! \brief Get When `group_by=line_item`, this field provides the line item of the grouped costs result.
	 */
	std::string getLineItem();

	/*! \brief Set When `group_by=line_item`, this field provides the line item of the grouped costs result.
	 */
	void setLineItem(std::string  line_item);
	/*! \brief Get When `group_by=project_id`, this field provides the project ID of the grouped costs result.
	 */
	std::string getProjectId();

	/*! \brief Set When `group_by=project_id`, this field provides the project ID of the grouped costs result.
	 */
	void setProjectId(std::string  project_id);


    private:
    std::string object{};
    CostsResult_amount amount;
    std::string line_item{};
    std::string project_id{};
};
}

#endif /* TINY_CPP_CLIENT_CostsResult_H_ */
