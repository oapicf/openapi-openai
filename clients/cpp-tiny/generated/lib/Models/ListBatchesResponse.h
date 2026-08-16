
/*
 * ListBatchesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ListBatchesResponse_H_
#define TINY_CPP_CLIENT_ListBatchesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Batch.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ListBatchesResponse{
public:

    /*! \brief Constructor.
	 */
    ListBatchesResponse();
    ListBatchesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ListBatchesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
	bool isHasMore();

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
    std::list<Batch> data;
    std::string first_id{};
    std::string last_id{};
    bool has_more{};
    std::string object{};
};
}

#endif /* TINY_CPP_CLIENT_ListBatchesResponse_H_ */
