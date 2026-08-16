
/*
 * ProjectUserDeleteResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectUserDeleteResponse_H_
#define TINY_CPP_CLIENT_ProjectUserDeleteResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectUserDeleteResponse{
public:

    /*! \brief Constructor.
	 */
    ProjectUserDeleteResponse();
    ProjectUserDeleteResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectUserDeleteResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	bool isDeleted();

	/*! \brief Set 
	 */
	void setDeleted(bool  deleted);


    private:
    std::string object{};
    std::string id{};
    bool deleted{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectUserDeleteResponse_H_ */
