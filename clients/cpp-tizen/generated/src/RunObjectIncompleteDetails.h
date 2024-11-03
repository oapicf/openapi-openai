/*
 * RunObject_incomplete_details.h
 *
 * Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
 */

#ifndef _RunObject_incomplete_details_H_
#define _RunObject_incomplete_details_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Details on why the run is incomplete. Will be `null` if the run is not incomplete.
 *
 *  \ingroup Models
 *
 */

class RunObject_incomplete_details : public Object {
public:
	/*! \brief Constructor.
	 */
	RunObject_incomplete_details();
	RunObject_incomplete_details(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RunObject_incomplete_details();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	 */
	std::string getReason();

	/*! \brief Set The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
	 */
	void setReason(std::string  reason);

private:
	std::string reason;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RunObject_incomplete_details_H_ */
