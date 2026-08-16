
/*
 * AuditLog_user_added_data.h
 *
 * The payload used to add the user to the project.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_user_added_data_H_
#define TINY_CPP_CLIENT_AuditLog_user_added_data_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The payload used to add the user to the project.
 *
 *  \ingroup Models
 *
 */

class AuditLog_user_added_data{
public:

    /*! \brief Constructor.
	 */
    AuditLog_user_added_data();
    AuditLog_user_added_data(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_user_added_data();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The role of the user. Is either `owner` or `member`.
	 */
	std::string getRole();

	/*! \brief Set The role of the user. Is either `owner` or `member`.
	 */
	void setRole(std::string  role);


    private:
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_user_added_data_H_ */
