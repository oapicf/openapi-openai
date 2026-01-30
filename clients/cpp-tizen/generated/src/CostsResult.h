/*
 * CostsResult.h
 *
 * The aggregated costs details of the specific time bucket.
 */

#ifndef _CostsResult_H_
#define _CostsResult_H_


#include <string>
#include "CostsResult_amount.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The aggregated costs details of the specific time bucket.
 *
 *  \ingroup Models
 *
 */

class CostsResult : public Object {
public:
	/*! \brief Constructor.
	 */
	CostsResult();
	CostsResult(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CostsResult();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string object;
	CostsResult_amount amount;
	std::string line_item;
	std::string project_id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CostsResult_H_ */
