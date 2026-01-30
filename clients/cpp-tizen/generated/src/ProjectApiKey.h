/*
 * ProjectApiKey.h
 *
 * Represents an individual API key in a project.
 */

#ifndef _ProjectApiKey_H_
#define _ProjectApiKey_H_


#include <string>
#include "ProjectApiKey_owner.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents an individual API key in a project.
 *
 *  \ingroup Models
 *
 */

class ProjectApiKey : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectApiKey();
	ProjectApiKey(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectApiKey();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `organization.project.api_key`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.api_key`
	 */
	void setObject(std::string  object);
	/*! \brief Get The redacted value of the API key
	 */
	std::string getRedactedValue();

	/*! \brief Set The redacted value of the API key
	 */
	void setRedactedValue(std::string  redacted_value);
	/*! \brief Get The name of the API key
	 */
	std::string getName();

	/*! \brief Set The name of the API key
	 */
	void setName(std::string  name);
	/*! \brief Get The Unix timestamp (in seconds) of when the API key was created
	 */
	int getCreatedAt();

	/*! \brief Set The Unix timestamp (in seconds) of when the API key was created
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get The identifier, which can be referenced in API endpoints
	 */
	std::string getId();

	/*! \brief Set The identifier, which can be referenced in API endpoints
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	ProjectApiKey_owner getOwner();

	/*! \brief Set 
	 */
	void setOwner(ProjectApiKey_owner  owner);

private:
	std::string object;
	std::string redacted_value;
	std::string name;
	int created_at;
	std::string id;
	ProjectApiKey_owner owner;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectApiKey_H_ */
