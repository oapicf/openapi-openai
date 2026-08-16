
/*
 * ProjectServiceAccountListResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ProjectServiceAccountListResponse_H_
#define TINY_CPP_CLIENT_ProjectServiceAccountListResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ProjectServiceAccount.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectServiceAccountListResponse{
public:

    /*! \brief Constructor.
	 */
    ProjectServiceAccountListResponse();
    ProjectServiceAccountListResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ProjectServiceAccountListResponse();


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
	std::list<ProjectServiceAccount> getData();

	/*! \brief Set 
	 */
	void setData(std::list <ProjectServiceAccount> data);
	/*! \brief Get 
	 */
	std::string getFirstId();

	/*! \brief Set 
	 */
	void setFirstId(std::string  first_id);
	/*! \brief Get 
	 */
	std::string getLastId();

	/*! \brief Set 
	 */
	void setLastId(std::string  last_id);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);


    private:
    std::string object{};
    std::list<ProjectServiceAccount> data;
    std::string first_id{};
    std::string last_id{};
    bool has_more{};
};
}

#endif /* TINY_CPP_CLIENT_ProjectServiceAccountListResponse_H_ */
