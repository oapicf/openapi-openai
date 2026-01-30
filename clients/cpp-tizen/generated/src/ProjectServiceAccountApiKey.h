/*
 * ProjectServiceAccountApiKey.h
 *
 * 
 */

#ifndef _ProjectServiceAccountApiKey_H_
#define _ProjectServiceAccountApiKey_H_


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

class ProjectServiceAccountApiKey : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectServiceAccountApiKey();
	ProjectServiceAccountApiKey(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectServiceAccountApiKey();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The object type, which is always `organization.project.service_account.api_key`
	 */
	std::string getObject();

	/*! \brief Set The object type, which is always `organization.project.service_account.api_key`
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getValue();

	/*! \brief Set 
	 */
	void setValue(std::string  value);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);

private:
	std::string object;
	std::string value;
	std::string name;
	int created_at;
	std::string id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectServiceAccountApiKey_H_ */
