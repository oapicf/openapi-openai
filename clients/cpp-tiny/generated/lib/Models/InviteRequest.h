
/*
 * InviteRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteRequest_H_
#define TINY_CPP_CLIENT_InviteRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "InviteRequest_projects_inner.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteRequest{
public:

    /*! \brief Constructor.
	 */
    InviteRequest();
    InviteRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Send an email to this address
	 */
	std::string getEmail();

	/*! \brief Set Send an email to this address
	 */
	void setEmail(std::string  email);
	/*! \brief Get `owner` or `reader`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `reader`
	 */
	void setRole(std::string  role);
	/*! \brief Get An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
	 */
	std::list<InviteRequest_projects_inner> getProjects();

	/*! \brief Set An array of projects to which membership is granted at the same time the org invite is accepted. If omitted, the user will be invited to the default project for compatibility with legacy behavior.
	 */
	void setProjects(std::list <InviteRequest_projects_inner> projects);


    private:
    std::string email{};
    std::string role{};
    std::list<InviteRequest_projects_inner> projects;
};
}

#endif /* TINY_CPP_CLIENT_InviteRequest_H_ */
