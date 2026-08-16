
/*
 * AuditLog_organization_updated_changes_requested.h
 *
 * The payload used to update the organization settings.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_H_
#define TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_organization_updated_changes_requested_settings.h"

namespace Tiny {


/*! \brief The payload used to update the organization settings.
 *
 *  \ingroup Models
 *
 */

class AuditLog_organization_updated_changes_requested{
public:

    /*! \brief Constructor.
	 */
    AuditLog_organization_updated_changes_requested();
    AuditLog_organization_updated_changes_requested(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_organization_updated_changes_requested();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string title{};
    std::string description{};
    std::string name{};
    AuditLog_organization_updated_changes_requested_settings settings;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_organization_updated_changes_requested_H_ */
