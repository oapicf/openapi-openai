/*
 * ProjectListResponse.h
 *
 * 
 */

#ifndef _ProjectListResponse_H_
#define _ProjectListResponse_H_


#include <string>
#include "Project.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ProjectListResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ProjectListResponse();
	ProjectListResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProjectListResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);
	/*! \brief Get 
	 */
	std::list<Project> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Project> data);
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
	bool getHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);

private:
	std::string object;
	std::list <Project>data;
	std::string first_id;
	std::string last_id;
	bool has_more;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProjectListResponse_H_ */
