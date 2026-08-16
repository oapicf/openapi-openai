
/*
 * ProjectUserCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectUserCreateRequest_H_
#define TINY_CPP_CLIENT_ProjectUserCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectUserCreateRequest{
public:

    /*! \brief Constructor.
	 */
    ProjectUserCreateRequest();
    ProjectUserCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectUserCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The ID of the user.
	 */
	std::string getUserId();

	/*! \brief Set The ID of the user.
	 */
	void setUserId(std::string  user_id);
	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);


    private:
    std::string user_id{};
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectUserCreateRequest_H_ */
