
/*
 * ProjectServiceAccountCreateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectServiceAccountCreateRequest_H_
#define TINY_CPP_CLIENT_ProjectServiceAccountCreateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectServiceAccountCreateRequest{
public:

    /*! \brief Constructor.
	 */
    ProjectServiceAccountCreateRequest();
    ProjectServiceAccountCreateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectServiceAccountCreateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The name of the service account being created.
	 */
	std::string getName();

	/*! \brief Set The name of the service account being created.
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectServiceAccountCreateRequest_H_ */
