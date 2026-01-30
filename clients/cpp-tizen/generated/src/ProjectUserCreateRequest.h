/*
 * ProjectUserCreateRequest.h
 *
 * 
 */

#ifndef _ProjectUserCreateRequest_H_
#define _ProjectUserCreateRequest_H_


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

class ProjectUserCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectUserCreateRequest();
	ProjectUserCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectUserCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The ID of the user.
	 */
	std::string getUserId();

	/*! \brief Set The ID of the user.
	 */
	void setUserId(std::string  user_id);
	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);

private:
	std::string user_id;
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectUserCreateRequest_H_ */
