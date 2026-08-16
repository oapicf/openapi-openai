
/*
 * AuditLog_user_added.h
 *
 * The details for events with this &#x60;type&#x60;.
 */

#ifndef TINY_CPP_CLIENT_AuditLog_user_added_H_
#define TINY_CPP_CLIENT_AuditLog_user_added_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "AuditLog_user_added_data.h"

namespace Tiny {


/*! \brief The details for events with this `type`.
 *
 *  \ingroup Models
 *
 */

class AuditLog_user_added{
public:

    /*! \brief Constructor.
	 */
    AuditLog_user_added();
    AuditLog_user_added(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLog_user_added();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The user ID.
	 */
	std::string getId();

	/*! \brief Set The user ID.
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	AuditLog_user_added_data getData();

	/*! \brief Set 
	 */
	void setData(AuditLog_user_added_data  data);


    private:
    std::string id{};
    AuditLog_user_added_data data;
};
}

#endif /* TINY_CPP_CLIENT_AuditLog_user_added_H_ */
