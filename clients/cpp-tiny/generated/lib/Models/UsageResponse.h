
/*
 * UsageResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_UsageResponse_H_
#define TINY_CPP_CLIENT_UsageResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "UsageTimeBucket.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UsageResponse{
public:

    /*! \brief Constructor.
	 */
    UsageResponse();
    UsageResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UsageResponse();


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
	std::list<UsageTimeBucket> getData();

	/*! \brief Set 
	 */
	void setData(std::list <UsageTimeBucket> data);
	/*! \brief Get 
	 */
	bool isHasMore();

	/*! \brief Set 
	 */
	void setHasMore(bool  has_more);
	/*! \brief Get 
	 */
	std::string getNextPage();

	/*! \brief Set 
	 */
	void setNextPage(std::string  next_page);


    private:
    std::string object{};
    std::list<UsageTimeBucket> data;
    bool has_more{};
    std::string next_page{};
};
}

#endif /* TINY_CPP_CLIENT_UsageResponse_H_ */
