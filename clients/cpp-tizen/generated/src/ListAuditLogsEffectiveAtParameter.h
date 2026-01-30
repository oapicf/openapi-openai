/*
 * List_audit_logs_effective_at_parameter.h
 *
 * 
 */

#ifndef _List_audit_logs_effective_at_parameter_H_
#define _List_audit_logs_effective_at_parameter_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class List_audit_logs_effective_at_parameter : public Object {
public:
	/*! \brief Constructor.
	 */
	List_audit_logs_effective_at_parameter();
	List_audit_logs_effective_at_parameter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~List_audit_logs_effective_at_parameter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is greater than this value.
	 */
	int getGt();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is greater than this value.
	 */
	void setGt(int  gt);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
	 */
	int getGte();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
	 */
	void setGte(int  gte);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is less than this value.
	 */
	int getLt();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is less than this value.
	 */
	void setLt(int  lt);
	/*! \brief Get Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
	 */
	int getLte();

	/*! \brief Set Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
	 */
	void setLte(int  lte);

private:
	int gt;
	int gte;
	int lt;
	int lte;
	void __init();
	void __cleanup();

};
}
}

#endif /* _List_audit_logs_effective_at_parameter_H_ */
