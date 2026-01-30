/*
 * AuditLog_api_key_updated_changes_requested.h
 *
 * The payload used to update the API key.
 */

#ifndef _AuditLog_api_key_updated_changes_requested_H_
#define _AuditLog_api_key_updated_changes_requested_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to update the API key.
 *
 *  \ingroup Models
 *
 */

class AuditLog_api_key_updated_changes_requested : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_api_key_updated_changes_requested();
	AuditLog_api_key_updated_changes_requested(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_api_key_updated_changes_requested();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	 */
	std::list<std::string> getScopes();

	/*! \brief Set A list of scopes allowed for the API key, e.g. `[\"api.model.request\"]`
	 */
	void setScopes(std::list <std::string> scopes);

private:
	std::list <std::string>scopes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_api_key_updated_changes_requested_H_ */
