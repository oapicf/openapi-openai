/*
 * UserRoleUpdateRequest.h
 *
 * 
 */

#ifndef _UserRoleUpdateRequest_H_
#define _UserRoleUpdateRequest_H_


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

class UserRoleUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	UserRoleUpdateRequest();
	UserRoleUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UserRoleUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get `owner` or `reader`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `reader`
	 */
	void setRole(std::string  role);

private:
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _UserRoleUpdateRequest_H_ */
