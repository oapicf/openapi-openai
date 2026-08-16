
/*
 * ProjectServiceAccountCreateResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectServiceAccountCreateResponse_H_
#define TINY_CPP_CLIENT_ProjectServiceAccountCreateResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProjectServiceAccountApiKey.h"

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectServiceAccountCreateResponse{
public:

    /*! \brief Constructor.
	 */
    ProjectServiceAccountCreateResponse();
    ProjectServiceAccountCreateResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectServiceAccountCreateResponse();


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
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get Service accounts can only have one role of type `member`
	 */
	std::string getRole();

	/*! \brief Set Service accounts can only have one role of type `member`
	 */
	void setRole(std::string  role);
	/*! \brief Get 
	 */
	int getCreatedAt();

	/*! \brief Set 
	 */
	void setCreatedAt(int  created_at);
	/*! \brief Get 
	 */
	ProjectServiceAccountApiKey getApiKey();

	/*! \brief Set 
	 */
	void setApiKey(ProjectServiceAccountApiKey  api_key);


    private:
    std::string object{};
    std::string id{};
    std::string name{};
    std::string role{};
    int created_at{};
    ProjectServiceAccountApiKey api_key;
};
}

#endif /* TINY_CPP_CLIENT_ProjectServiceAccountCreateResponse_H_ */
