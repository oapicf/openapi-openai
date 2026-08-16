
/*
 * AuditLogActorServiceAccount.h
 *
 * The service account that performed the audit logged action.
 */

#ifndef TINY_CPP_CLIENT_AuditLogActorServiceAccount_H_
#define TINY_CPP_CLIENT_AuditLogActorServiceAccount_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The service account that performed the audit logged action.
 *
 *  \ingroup Models
 *
 */

class AuditLogActorServiceAccount{
public:

    /*! \brief Constructor.
	 */
    AuditLogActorServiceAccount();
    AuditLogActorServiceAccount(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~AuditLogActorServiceAccount();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The service account id.
	 */
	std::string getId();

	/*! \brief Set The service account id.
	 */
	void setId(std::string  id);


    private:
    std::string id{};
};
}

#endif /* TINY_CPP_CLIENT_AuditLogActorServiceAccount_H_ */
