/*
 * ProjectUpdateRequest.h
 *
 * 
 */

#ifndef _ProjectUpdateRequest_H_
#define _ProjectUpdateRequest_H_


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

class ProjectUpdateRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectUpdateRequest();
	ProjectUpdateRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectUpdateRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The updated name of the project, this name appears in reports.
	 */
	std::string getName();

	/*! \brief Set The updated name of the project, this name appears in reports.
	 */
	void setName(std::string  name);

private:
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectUpdateRequest_H_ */
