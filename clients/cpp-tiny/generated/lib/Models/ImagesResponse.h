
/*
 * ImagesResponse.h
 *
 * 
 */

#ifndef TINY_CPP_CLIENT_ImagesResponse_H_
#define TINY_CPP_CLIENT_ImagesResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Image.h"
#include <list>

namespace Tiny {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class ImagesResponse{
public:

    /*! \brief Constructor.
	 */
    ImagesResponse();
    ImagesResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~ImagesResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	int getCreated();

	/*! \brief Set 
	 */
	void setCreated(int  created);
	/*! \brief Get 
	 */
	std::list<Image> getData();

	/*! \brief Set 
	 */
	void setData(std::list <Image> data);


    private:
    int created{};
    std::list<Image> data;
};
}

#endif /* TINY_CPP_CLIENT_ImagesResponse_H_ */
