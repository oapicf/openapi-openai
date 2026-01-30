/*
 * ProjectServiceAccountCreateRequest.h
 *
 * 
 */

#ifndef _ProjectServiceAccountCreateRequest_H_
#define _ProjectServiceAccountCreateRequest_H_


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

class ProjectServiceAccountCreateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectServiceAccountCreateRequest();
	ProjectServiceAccountCreateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectServiceAccountCreateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the service account being created.
	 */
	std::string getName();

	/*! \brief Set The name of the service account being created.
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectServiceAccountCreateRequest_H_ */
