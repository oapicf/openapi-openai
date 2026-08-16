
/*
 * ProjectUpdateRequest.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectUpdateRequest_H_
#define TINY_CPP_CLIENT_ProjectUpdateRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectUpdateRequest{
public:

    /*! \brief Constructor.
	 */
    ProjectUpdateRequest();
    ProjectUpdateRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectUpdateRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get The updated name of the project, this name appears in reports.
	 */
	std::string getName();

	/*! \brief Set The updated name of the project, this name appears in reports.
	 */
	void setName(std::string  name);


    private:
    std::string name{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectUpdateRequest_H_ */
