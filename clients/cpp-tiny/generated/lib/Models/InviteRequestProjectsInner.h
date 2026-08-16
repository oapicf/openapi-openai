
/*
 * InviteRequest_projects_inner.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_InviteRequest_projects_inner_H_
#define TINY_CPP_CLIENT_InviteRequest_projects_inner_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class InviteRequest_projects_inner{
public:

    /*! \brief Constructor.
	 */
    InviteRequest_projects_inner();
    InviteRequest_projects_inner(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~InviteRequest_projects_inner();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Project's public ID
	 */
	std::string getId();

	/*! \brief Set Project's public ID
	 */
	void setId(std::string  id);
	/*! \brief Get Project membership role
	 */
	std::string getRole();

	/*! \brief Set Project membership role
	 */
	void setRole(std::string  role);


    private:
    std::string id{};
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_InviteRequest_projects_inner_H_ */
