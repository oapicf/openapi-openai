/*
 * AuditLog_organization_updated_changes_requested.h
 *
 * The payload used to update the organization settings.
 */

#ifndef _AuditLog_organization_updated_changes_requested_H_
#define _AuditLog_organization_updated_changes_requested_H_


#include <string>
#include "AuditLog_organization_updated_changes_requested_settings.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The payload used to update the organization settings.
 *
 *  \ingroup Models
 *
 */

class AuditLog_organization_updated_changes_requested : public Object {
public:
	/*! \brief Constructor.
	 */
	AuditLog_organization_updated_changes_requested();
	AuditLog_organization_updated_changes_requested(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuditLog_organization_updated_changes_requested();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The organization title.
	 */
	std::string getTitle();

	/*! \brief Set The organization title.
	 */
	void setTitle(std::string  title);
	/*! \brief Get The organization description.
	 */
	std::string getDescription();

	/*! \brief Set The organization description.
	 */
	void setDescription(std::string  description);
	/*! \brief Get The organization name.
	 */
	std::string getName();

	/*! \brief Set The organization name.
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	AuditLog_organization_updated_changes_requested_settings getSettings();

	/*! \brief Set 
	 */
	void setSettings(AuditLog_organization_updated_changes_requested_settings  settings);

private:
	std::string title;
	std::string description;
	std::string name;
	AuditLog_organization_updated_changes_requested_settings settings;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuditLog_organization_updated_changes_requested_H_ */
