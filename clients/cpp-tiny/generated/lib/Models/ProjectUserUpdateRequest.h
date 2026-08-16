
/*
 * ProjectUserUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectUserUpdateRequest_H_
#define TINY_CPP_CLIENT_ProjectUserUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectUserUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    ProjectUserUpdateRequest();
    ProjectUserUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectUserUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get `owner` or `member`
	 */
	std::string getRole();

	/*! \brief Set `owner` or `member`
	 */
	void setRole(std::string  role);


    private:
    std::string role{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectUserUpdateRequest_H_ */
