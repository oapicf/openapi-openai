/*
 * ListBatchesResponse.h
 *
 * 
 */

#ifndef _ListBatchesResponse_H_
#define _ListBatchesResponse_H_


#include <string>
#include "Batch.h"
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

class ListBatchesResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	ListBatchesResponse();
	ListBatchesResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ListBatchesResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<Batch> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Batch> data);
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
	/*! \brief Get 
	 */
	std::string getObject();

	/*! \brief Set 
	 */
	void setObject(std::string  object);

private:
	std::list <Batch>data;
	std::string first_id;
	std::string last_id;
	bool has_more;
	std::string object;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ListBatchesResponse_H_ */
