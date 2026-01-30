/*
 * ProjectUserUpdateRequest.h
 *
 * 
 */

#ifndef _ProjectUserUpdateRequest_H_
#define _ProjectUserUpdateRequest_H_


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

class ProjectUserUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectUserUpdateRequest();
	ProjectUserUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectUserUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);

private:
	std::string role;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectUserUpdateRequest_H_ */
